package my.comany.blog;

public class Blog {
  private String title;
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  private my.comany.blog.Post posts;
  
  public my.comany.blog.Post getPosts() {
    return posts;
  }
  
  public void setPosts(my.comany.blog.Post posts) {
    this.posts = posts;
  }
}
