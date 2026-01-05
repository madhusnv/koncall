package p001o;

import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class ke0 {
    /* renamed from: a */
    public static final je0 m35488a(Context context) {
        sq8.m48649h(context, "context");
        return new je0(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
