package my.comany.blog;

public class Post extends my.company.common.HasAuthor {
  private String title;
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  private String content;
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
  private my.comany.blog.Comment comments;
  
  public my.comany.blog.Comment getComments() {
    return comments;
  }
  
  public void setComments(my.comany.blog.Comment comments) {
    this.comments = comments;
  }
}
