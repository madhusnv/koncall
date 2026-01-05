package p001o;

import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class pjj {

    /* renamed from: a */
    public final sjj f40174a;

    /* renamed from: b */
    public final IntentFilter f40175b;

    /* renamed from: c */
    public final Context f40176c;

    /* renamed from: d */
    public final Set f40177d = new HashSet();

    /* renamed from: e */
    public volatile boolean f40178e = false;

    public pjj(sjj sjjVar, IntentFilter intentFilter, Context context) {
        this.f40174a = sjjVar;
        this.f40175b = intentFilter;
        this.f40176c = vkj.m52903a(context);
    }
}
