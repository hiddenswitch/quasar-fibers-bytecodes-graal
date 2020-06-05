/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quasar.fibers.bytecodes.graal;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.Suspendable;

import java.util.concurrent.ExecutionException;

public class App {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		var fiber = new Fiber<Void>(App::printLine);
		fiber.start().join();
	}

	@Suspendable
	public static void printLine() {
		if (Fiber.isCurrentFiber()) {
			System.out.println("executing in fiber");
		} else {
			System.out.println("executing not in fiber");
		}
	}
}
