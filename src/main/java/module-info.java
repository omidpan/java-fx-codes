module champlaincollege.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires javafx.graphics;
    requires javafx.media;

    exports champlaincollege.demo.chapter14.panes;
    opens champlaincollege.demo.chapter14.panes to javafx.fxml;
    exports champlaincollege.demo.chapter14.shapes;
    opens champlaincollege.demo.chapter14.shapes to javafx.fxml;
    exports champlaincollege.demo.clockdemo;
    opens champlaincollege.demo.clockdemo to javafx.fxml;
    exports champlaincollege.demo.chapter15.load;
    exports champlaincollege.demo.chapter15.handler;
    exports champlaincollege.demo.chapter15.mouseandkeyboard;
    exports champlaincollege.demo.chapter15.observablelistener;
    exports champlaincollege.demo.chapter15.animation;
    exports champlaincollege.demo.chapter16;
    exports champlaincollege.demo.chapter14;
    opens champlaincollege.demo.chapter14 to javafx.fxml;
    exports champlaincollege.demo.chapter16.casestudy;
    exports champlaincollege.demo.chapter16.media;
    exports champlaincollege.demo.chapter31;
    exports champlaincollege.demo.chapter31.menu;
    exports champlaincollege.demo.chapter31.panes;
    exports champlaincollege.demo.exams.q1;
    exports champlaincollege.demo.exams.q2;

}