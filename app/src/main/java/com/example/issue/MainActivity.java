package com.example.issue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private BasicGLSurfaceView mView;
    private GLES20TriangleRenderer mRenderer;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        mRenderer = new GLES20TriangleRenderer(getApplication());
        mView = new BasicGLSurfaceView(mRenderer);
        setContentView(mView);
    }

    @Override
    protected void onPause() {
        mRenderer.hangAndRecover();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onPause();
        mView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mView.onResume();
    }
}