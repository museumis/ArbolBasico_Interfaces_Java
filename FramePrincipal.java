import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class FramePrincipal {
	JFrame frame;

	public FramePrincipal() {
		frame = new JFrame("");
		frame.setBounds(200, 200, 1100, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void iniciar() {
		iniciarComponentes();
		iniciarListened();
		frame.setVisible(true);
	}

	public void iniciarComponentes() {

		DefaultMutableTreeNode raiz, categoria, letra, nombre;
		// RAIZ Y ARBOL
		raiz = new DefaultMutableTreeNode("Telefonos");
		JTree arbol = new JTree(raiz);
		
		// -------------------------------------------------------------------
		// AMIGOS - Nodo 1, hijo raiz
		categoria = new DefaultMutableTreeNode("Amigos");
		raiz.add(categoria);
		// LETRA - nodo 1
		letra = new DefaultMutableTreeNode("A");
		categoria.add(letra);
		// NOMBRES
		nombre = new DefaultMutableTreeNode("Fin 1");
		letra.add(nombre);
		nombre = new DefaultMutableTreeNode("Fin 2");
		letra.add(nombre);
		nombre = new DefaultMutableTreeNode("Fin 3");
		letra.add(nombre);
		// LETRA - nodo 2
		letra = new DefaultMutableTreeNode("B");
		categoria.add(letra);
		// NOMBRES
		nombre = new DefaultMutableTreeNode("Fin 1");
		letra.add(nombre);
		nombre = new DefaultMutableTreeNode("Fin 2");
		letra.add(nombre);
		
		
		// -------------------------------------------------------------------
		// AMIGOS - Nodo 1, hijo raiz
		categoria = new DefaultMutableTreeNode("Clientes");
		raiz.add(categoria);
		// LETRA - nodo 1
		letra = new DefaultMutableTreeNode("C");
		categoria.add(letra);
		// NOMBRES
		nombre = new DefaultMutableTreeNode("Fin 1");
		letra.add(nombre);
		nombre = new DefaultMutableTreeNode("Fin 2");
		letra.add(nombre);
		// LETRA - nodo 2
		letra = new DefaultMutableTreeNode("D");
		categoria.add(letra);
		// NOMBRES
		nombre = new DefaultMutableTreeNode("Fin 1");
		letra.add(nombre);
		nombre = new DefaultMutableTreeNode("Fin 2");
		letra.add(nombre);
		// ------------------------------------------------
		// ANADIR ARBOL
		frame.add(new JScrollPane(arbol));
	}

	public void iniciarListened() {

	}
}
