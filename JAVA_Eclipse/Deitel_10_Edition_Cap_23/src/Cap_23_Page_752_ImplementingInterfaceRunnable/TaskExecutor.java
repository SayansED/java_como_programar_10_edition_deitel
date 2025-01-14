package Cap_23_Page_752_ImplementingInterfaceRunnable;

// Usando um ExecutorService para executar Runnable.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor {

	public static void main(String[] args) {
		
		// Cria e nomeia cada execut�vel
		PrintTask task1 = new PrintTask("task1");
		PrintTask task2 = new PrintTask("task2");
		PrintTask task3 = new PrintTask("task3");
		
		System.out.println("Starting Executor");
		
		// Cria ExecutorService para gerenciar threads
		/* M�todo newCachedThreadPool para obter um ExecutorService que � capaz de criar novas thread
		 * � medida que s�o necess�rias, pelo aplicativo. Essas threads s�o usadas pelo ExecutorService para 
		 * executar Runnables */
		 ExecutorService executorService = Executors.newCachedThreadPool();
		
		// Inicia as tr�s PrintTasks
		 executorService.execute(task1); // Inicia task1
		 executorService.execute(task2); // Inicia task2
		 executorService.execute(task3); // Inicia task3
		 
		 // Fecha ExecutorService -- ele decide quando fechar threads
		 executorService.shutdown(); /* Para parar de aceitar novas tarefas, mas continua executando as 
		 tarefas que j� foram submetidas*/
		 
		 System.out.printf("Tasks started, main ends.%n%n");
	}
} // End class
