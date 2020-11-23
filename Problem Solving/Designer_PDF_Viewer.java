
public class Designer_PDF_Viewer{
static int designerPdfViewer(int[] h, String word) {
            int[] temp = new int[word.length()];
            
            for(int i=0;i<word.length();i++){
                temp[i] = h[word.charAt(i)-97];
            }
            int max = temp[0];
            
            for(int i=0;i<temp.length;i++){
                if(temp[i]>max){
                    max = temp[i];
                }
            }
            int result = max*1*word.length();
            return result;

    }
    }
