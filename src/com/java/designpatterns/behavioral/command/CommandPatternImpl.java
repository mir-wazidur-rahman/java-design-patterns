package com.java.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Command Pattern:
Ensures method invocation encapsulation, i.e encapsulates a request as an object (OCP)
4 components command, receiver, invoker and client
Command: Knows about receiver and invokes the method. Param values are stored in command
Receiver: does the work
Invoker: knows how to execute a command and optionally does bookkeeping about the command
Client: decides which command to execute when, passing invoker object
 * 
 * 
 * 
 * @author Mir
 *
 */
//command
interface Command{
	void execute();
}

//receiver
class Light{
	public void turnOn() {
		System.out.println("Lights are on...");
	}
	
	public void turnOff() {
		System.out.println("Lights are off...");
	}
}

//receiver states
class TurnOnCommand implements Command{

	private Light light;
	
	
	public TurnOnCommand(Light light) {
		super();
		this.light = light;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.turnOn();
	}
	
}

class TurnOffCommand implements Command{

	private Light light;
	
	
	public TurnOffCommand(Light light) {
		super();
		this.light = light;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.turnOff();
	}
	
}


//Invoker
class Switcher{
	
	public List<Command> commands;
	
	public Switcher() {
		this.commands = new ArrayList<>();
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void executeCommands() {
		for (Command command : commands) {
			command.execute();
		}
	}
	
}

public class CommandPatternImpl {

	public static void main(String[] args) {
		
		Light light = new Light();
		
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		
		Switcher invoker = new Switcher();
		
		invoker.addCommand(turnOnCommand);
		invoker.addCommand(turnOffCommand);
		
		invoker.executeCommands();
	}
}
