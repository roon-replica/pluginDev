import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class Hello extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showInputDialog("hello, plugin dev!", "what plugin do you want to make?", Messages.getQuestionIcon());
    }
}
