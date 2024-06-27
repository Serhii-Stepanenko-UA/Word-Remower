package app;

// В класі формується новий перелік слів,
// за виключенням слова "onion"
public class Remover {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String str : strs)
            if (!str.equals("onion")) {
                count++;
                stringBuilder.append("(").append(count).append(")").append(str).append(" ");
            }
        return stringBuilder.toString();
    }
}