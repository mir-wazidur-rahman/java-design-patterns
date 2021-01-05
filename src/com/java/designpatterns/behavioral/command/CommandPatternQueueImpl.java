package com.java.designpatterns.behavioral.command;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

interface CommandNew {
	void execute();
}

class Task {

	private int id;

	public Task(int id) {
		this.id = id;
	}

	public void solveProblem() {
		System.out.println("Solve some problem fo task id : " + id);
	}
}

class TaskSolver implements CommandNew {

	private Task task;

	public TaskSolver(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.task.solveProblem();
	}

}

class Algorithm {

	private BlockingQueue<CommandNew> commandList;

	public Algorithm() {
		this.commandList = new ArrayBlockingQueue<>(10);
	}

	public void produce() {
		try {

			for (int i = 0; i < 10; i++)
				commandList.put(new TaskSolver(new Task(i + 1)));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void consume() {

		try {

			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				commandList.take().execute();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class CommandPatternQueueImpl {

	public static void main(String[] args) {

		final Algorithm algo = new Algorithm();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				algo.produce();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				algo.consume();
			}
		});
		
		t1.start();
		t2.start();
	}

}
