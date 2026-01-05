package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.nio.CharBuffer;

/* loaded from: classes2.dex */
public abstract class k75 {
    /* renamed from: a */
    public static String m35102a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* renamed from: b */
    public static String m35103b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: c */
    public static String m35104c(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "?" + i;
        }
    }

    /* renamed from: d */
    public static String m35105d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: e */
    public static String m35106e(MotionLayout motionLayout, int i) {
        return m35107f(motionLayout, i, -1);
    }

    /* renamed from: f */
    public static String m35107f(MotionLayout motionLayout, int i, int i2) throws Resources.NotFoundException {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i2) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    /* renamed from: g */
    public static void m35108g(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String str4 = ".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName();
            str3 = str3 + " ";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            sb.append(str4);
            sb.append(str3);
        }
    }
}
