package my.comany.blog;

public class Comment extends my.company.common.HasAuthor {
  private String content;
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
}
