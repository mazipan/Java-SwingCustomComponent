package swingcustomcomponent.model;

/**
 * The Class GeneralModel.
 * 
 * Use for convert model or entity that not have method toString()
 * like you want it.
 * 
 * case : if you want insert object to JTable and you need overide method toString() but you can't.
 * 			you can convert object with this general model.
 * 
 */
public class GeneralModel {

    /** The id. */
    private int id;
    
    /** The name. */
    private String name;
    
    /** The type. */
    private String type;
    
    /** The object. */
    private Object object;
    
    /** The Value. */
    private String Value;

    /**
     * Instantiates a new general model.
     *
     * @param id the id
     * @param name the name
     */
    public GeneralModel(int id, String name ){
        this.id = id;
        this.name = name;
    }
    
    /**
     * Instantiates a new general model.
     *
     * @param id the id
     * @param name the name
     * @param type the type
     */
    public GeneralModel(int id, String name, String type ){
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    /**
     * Instantiates a new general model.
     *
     * @param id the id
     * @param name the name
     * @param type the type
     * @param object the object
     */
    public GeneralModel(int id, String name, String type, Object object ){
        this.id = id;
        this.name = name;
        this.type = type;
        this.object = object;
    }
    
    /**
     * Instantiates a new general model.
     *
     * @param id the id
     * @param name the name
     * @param type the type
     * @param object the object
     * @param Value the value
     */
    public GeneralModel(int id, String name, String type, Object object, String Value ){
        this.id = id;
        this.name = name;
        this.type = type;
        this.object = object;
        this.Value = Value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
	public String toString(){
        return getName();
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(int id) {
        this.id = id;
    }

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the object.
	 *
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * Sets the object.
	 *
	 * @param object the new object
	 */
	public void setObject(Object object) {
		this.object = object;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return Value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		Value = value;
	}
    
    
}