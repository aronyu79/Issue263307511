package com.example.issue;

import android.content.Context;
import android.opengl.GLSurfaceView;

import android.opengl.GLES20;

class BasicGLSurfaceView extends GLSurfaceView {
    public BasicGLSurfaceView(GLES20TriangleRenderer renderer) {
        super(renderer.getContext());
        setEGLContextClientVersion(2);
        setRenderer(renderer);
    }
}

