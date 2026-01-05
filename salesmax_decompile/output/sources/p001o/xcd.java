package p001o;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes2.dex */
public final class xcd {

    /* renamed from: a */
    public final long f53524a;

    /* renamed from: b */
    public final List f53525b;

    /* renamed from: c */
    public final MotionEvent f53526c;

    public xcd(long j, List list, MotionEvent motionEvent) {
        sq8.m48649h(list, "pointers");
        sq8.m48649h(motionEvent, "motionEvent");
        this.f53524a = j;
        this.f53525b = list;
        this.f53526c = motionEvent;
    }

    /* renamed from: a */
    public final MotionEvent m56021a() {
        return this.f53526c;
    }

    /* renamed from: b */
    public final List m56022b() {
        return this.f53525b;
    }
}
