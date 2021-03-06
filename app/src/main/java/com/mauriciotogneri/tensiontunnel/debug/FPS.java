package com.mauriciotogneri.tensiontunnel.debug;

import android.util.Log;

public class FPS
{
    private static long framesStart = System.nanoTime();
    private static int frames = 0;

    public static void log(long currentTime)
    {
        FPS.frames++;

        if ((currentTime - FPS.framesStart) > 1E9)
        {
            Log.e("FPS", "FPS: " + FPS.frames);
            FPS.frames = 0;
            FPS.framesStart = System.nanoTime();
        }
    }
}