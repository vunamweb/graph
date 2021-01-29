package com.example.administrator.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.myapplication.models.GraphData;
import com.example.administrator.myapplication.models.PointMap;

public class MainActivity extends AppCompatActivity {
    CurveGraphView curveGraphView2;
    CurveGraphView curveGraphView;
    int pointRadius = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        curveGraphView = findViewById(R.id.cgv);

        curveGraphView.configure(
                new CurveGraphConfig.Builder(this)
                        .setAxisColor(R.color.Blue)                                             // Set number of values to be displayed in X ax
                        .setVerticalGuideline(4)                                                // Set number of background guidelines to be shown.
                        .setHorizontalGuideline(2)
                        .setGuidelineColor(R.color.Red)                                         // Set color of the visible guidelines.
                        .setNoDataMsg(" No Data ")                                              // Message when no data is provided to the view.
                        .setxAxisScaleTextColor(R.color.Black)                                  // Set X axis scale text color.
                        .setyAxisScaleTextColor(R.color.Black)                                  // Set Y axis scale text color
                        .setAnimationDuration(2000)                                             // Set Animation Duration
                        .build()
        );


        final PointMap pointMap = new PointMap();
        pointMap.addPoint(1, 100, "2020-12-12");
        pointMap.addPoint(2, 300, "2020-12-13");
        pointMap.addPoint(3, 400, "2020-12-30");
        pointMap.addPoint(4, 150, "2020-12-12");
        pointMap.addPoint(5, 200, "2020-12-12");
        pointMap.addPoint(6, 220, "2020-12-12");
        pointMap.addPoint(7, 210, "2020-12-12");
        pointMap.addPoint(8, 200, "2020-12-12");
        pointMap.addPoint(9, 240, "2020-12-12");
        pointMap.addPoint(10, 200, "2020-12-12");
        pointMap.addPoint(11, 100, "2020-12-12");
        pointMap.addPoint(12, 200, "2020-12-12");


        final GraphData gd = GraphData.builder(this)
                .setPointMap(pointMap)
                .setGraphStroke(R.color.Black)
                .setGraphGradient(R.color.gradientStartColor2, R.color.gradientEndColor2)
                .animateLine(true)
                .setPointColor(R.color.Green)
                .setPointRadius(pointRadius)
                .build();

        /*PointMap p2 = new PointMap();
        p2.addPoint(0, 440);
        p2.addPoint(1, 0);
        p2.addPoint(2, 100);
        p2.addPoint(3, 0);
        p2.addPoint(4, 400);
        p2.addPoint(5, 200);

        final GraphData gd2 = GraphData.builder(this)
                .setPointMap(p2)
                .setGraphStroke(R.color.Green)
                .setGraphGradient(R.color.gradientStartColor, R.color.gradientEndColor)
                .animateLine(true)
                .build();*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                curveGraphView.setData(pointMap.getPointMap().size(), 600, gd);
            }
        }, 250);
    }
}
