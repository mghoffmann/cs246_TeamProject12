/**
 * Adapter class for exposing data from YouTubeVideo class via
 * the SocialMediaEntry interface.
 */
class YouTubeVideoAdapter implements SocialMediaEntry {

   YouTubeVideo adaptee;

   public YouTubeVideoAdapter(YouTubeVideo adaptee) {
      this.adaptee = adaptee;
   }

   public String getPostText() {
      return adaptee.getTitle() + ": " + adaptee.getDescription();
   }

   public String getUser() {
      return adaptee.getAuthor(); 
   }
}
