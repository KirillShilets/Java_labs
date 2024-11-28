import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String text = "As you become more confident with reading English stories, you can start to " +
                "increase your speed. Reading quickly will help you to improve your comprehension skills. " +
                "Make sure that you still take the time to look up any new words or phrases!";
        findMinAndMaxWords(text);
    }

    public static void findMinAndMaxWords(String text) {
        String resText = text.replaceAll("\\pP", "");

        String[] arrOfText = resText.split(" ");
        String minWord = arrOfText[0];
        String maxWord = arrOfText[0];
        for (String s : arrOfText) {
            if (s.isEmpty()) continue;
            if(s.length() < minWord.length()) {
                minWord = s;
            }
            if(s.length() > maxWord.length()) {
                maxWord = s;
            }
        }

        System.out.println("Самое длинное слово: " + maxWord);
        System.out.println("Самое короткое слово: " + minWord);
    }
}
