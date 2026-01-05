package gc;

import cv.C1517m;
import kotlin.jvm.internal.AbstractC4154l;
import ud.C7416t;
import ud.InterfaceC7409m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gc.f */
/* loaded from: classes.dex */
public abstract class AbstractC2562f {

    /* renamed from: a */
    public static final C2557a f13964a;

    /* renamed from: b */
    public static final C2557a f13965b;

    /* renamed from: c */
    public static final C2557a f13966c;

    /* renamed from: d */
    public static final C2557a f13967d;

    static {
        int i10 = 0;
        f13964a = new C2557a(i10, C2559c.f13961a);
        f13965b = new C2557a(i10, C2560d.f13962a);
        f13966c = new C2557a(i10, C2561e.f13963a);
        f13967d = new C2557a(i10, new C1517m(9));
    }

    /* renamed from: a */
    public static final Object m6572a(C2558b c2558b, InterfaceC7409m platform) {
        Object objInvoke;
        AbstractC4154l.m8923f(c2558b, "<this>");
        AbstractC4154l.m8923f(platform, "platform");
        String key = c2558b.f13958b;
        C7416t c7416t = (C7416t) platform;
        AbstractC4154l.m8923f(key, "key");
        String property = System.getProperty(key);
        if (property == null) {
            property = c7416t.m13806a(c2558b.f13959c);
        }
        return (property == null || (objInvoke = c2558b.f13957a.invoke(property)) == null) ? c2558b.f13960d : objInvoke;
    }
}
