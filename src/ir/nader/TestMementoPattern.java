package ir.nader;

import ir.nader.momento.Editor;
import ir.nader.momento.History;

public class TestMementoPattern {

    public static void main(String[] args) {
	// write your code here
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
//        editor.restore(history.pop());

        System.out.println("editor = " + editor.getContent());

    }
}
