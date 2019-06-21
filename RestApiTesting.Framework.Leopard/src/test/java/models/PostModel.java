package models;

public class PostModel 
{
    private int id;

    private String title;

    private String body;

    private int userId;

    public PostModel() 
	{
	}

    public PostModel(String body) 
    {
    	setBody(body);
 	}

    public PostModel(int userId, int id, String title, String body) 
    {
       	setId(id);
   	    setTitle(title);
    	setBody(body);
    	setUserId(userId);
 	}
    
    public PostModel(int userId, String title, String body) 
    {
   	    setTitle(title);
    	setBody(body);
    	setUserId(userId);
 	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
