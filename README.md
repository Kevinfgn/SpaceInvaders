# SpaceInvaders
Proyecto 1 - Estructuras de Datos
import org.lwjgl.glfw.*;

public class Main {

	public static void main(String[] args) {
		if(!GLFW.glfwInit()) {
			throw new IllegalStateException("No se pudo inicializar la libreria");
		}
		GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_FALSE);
		long window = GLFW.glfwCreateWindow(1000, 600, "INVADERS", 0, 0);
		if(window == 0) {
			throw new IllegalStateException("No se pudo crear la ventana");
		}
		GLFW.glfwSetWindowPos(window, 180 ,50 );
		GLFW.glfwShowWindow(window);
		while(!GLFW.glfwWindowShouldClose(window)) {
			GLFW.glfwPollEvents();
		}
		GLFW.glfwTerminate();
	}	
}
	
