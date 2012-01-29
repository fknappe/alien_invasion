package fknappe.alieninvasion.collision;

/**
 * Classe responsavel pelo tratamento das colisoes
 * entre os objetos do jogo
 * 
 * @author fknappe
 *
 */
public class BoundingBox {
	
	// Declaracao das variaves de instancia
	/**
	 * @uml.property  name="xMin"
	 */
	private int xMin;
	/**
	 * @uml.property  name="yMin"
	 */
	private int yMin;
	/**
	 * @uml.property  name="xMax"
	 */
	private int xMax;
	/**
	 * @uml.property  name="yMax"
	 */
	private int yMax;
	
	/**
	 * Construtor
	 * 
	 * Cria uma nova instancia do boundingbox para os objetos
	 * 
	 * @param int xMin
	 * @param int yMin
	 * @param int xMax
	 * @param int yMax
	 */
	public BoundingBox(int xMin, int yMin, int xMax, int yMax) {
		this.xMin = xMin;
		this.yMin = yMin;
		this.xMax = xMax;
		this.yMax = yMax;
	}
	
	/**
	 * Metodo responsavel pelo tratamento de colisao entre objetos 2D (determine se
	 * os dois objetos estao colidindo)
	 *  
	 * @param BoundingBox outroBoundingBox
	 * 
	 * @return void
	 */
	public boolean colide(BoundingBox outroBoundingBox) {
		if 	((this.getXMin() <= outroBoundingBox.getXMax() && this.getXMin() >= outroBoundingBox.getXMin()) || 
				(this.getXMax() <= outroBoundingBox.getXMax() && this.getXMax() >= outroBoundingBox.getXMin()) 
			) {
			if  ((this.getYMin() <= outroBoundingBox.getYMax() && this.getYMin() >= outroBoundingBox.getYMin()) || 
				 (this.getYMax() <= outroBoundingBox.getYMax() && this.getYMax() >= outroBoundingBox.getYMin()) )
				 return true;
		    if (this.getYMin() <= outroBoundingBox.getYMin() && this.getYMax() >= outroBoundingBox.getYMax() )
		    	return true;			
		}
		if 	((this.getYMin() <= outroBoundingBox.getYMax() && this.getYMin() >= outroBoundingBox.getYMin()) || 
				(this.getYMax() <= outroBoundingBox.getYMax() && this.getYMax() >= outroBoundingBox.getYMin()) 
			) {
			if  ((this.getXMin() <= outroBoundingBox.getXMax() && this.getXMin() >= outroBoundingBox.getXMin()) || 
				 (this.getXMax() <= outroBoundingBox.getXMax() && this.getXMax() >= outroBoundingBox.getXMin()) )
				 return true;
		    if (this.getXMin() <= outroBoundingBox.getXMin() && this.getXMax() >= outroBoundingBox.getXMax() )
		    	return true;			
		}			
		return false;
	}
	
	// Metodos getters e setters
	public int getXMax() {
		return xMax;
	}
	
	public void setXMax(int max) {
		xMax = max;
	}
	
	public int getXMin() {
		return xMin;
	}
	
	public void setXMin(int min) {
		xMin = min;
	}
	
	public int getYMax() {
		return yMax;
	}
	
	public void setYMax(int max) {
		yMax = max;
	}
	
	public int getYMin() {
		return yMin;
	}
	
	public void setYMin(int min) {
		yMin = min;
	}
}