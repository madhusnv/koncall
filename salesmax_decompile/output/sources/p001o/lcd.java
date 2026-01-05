package p001o;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes2.dex */
public final class lcd {

    /* renamed from: a */
    public final List f33619a;

    /* renamed from: b */
    public final vp8 f33620b;

    /* renamed from: c */
    public final int f33621c;

    /* renamed from: d */
    public final int f33622d;

    /* renamed from: e */
    public int f33623e;

    public lcd(List list, vp8 vp8Var) {
        sq8.m48649h(list, "changes");
        this.f33619a = list;
        this.f33620b = vp8Var;
        MotionEvent motionEventM36952c = m36952c();
        this.f33621c = kcd.m35409a(motionEventM36952c != null ? motionEventM36952c.getButtonState() : 0);
        MotionEvent motionEventM36952c2 = m36952c();
        this.f33622d = ddd.m22822b(motionEventM36952c2 != null ? motionEventM36952c2.getMetaState() : 0);
        this.f33623e = m36950a();
    }

    /* renamed from: a */
    public final int m36950a() {
        MotionEvent motionEventM36952c = m36952c();
        if (motionEventM36952c != null) {
            int actionMasked = motionEventM36952c.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return ocd.f38119a.m41985d();
                    }
                    return ocd.f38119a.m41984c();
                }
                return ocd.f38119a.m41986e();
            }
            return ocd.f38119a.m41985d();
        }
        List list = this.f33619a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vcd vcdVar = (vcd) list.get(i);
            if (mcd.m38744b(vcdVar)) {
                return ocd.f38119a.m41986e();
            }
            if (mcd.m38743a(vcdVar)) {
                return ocd.f38119a.m41985d();
            }
        }
        return ocd.f38119a.m41984c();
    }

    /* renamed from: b */
    public final List m36951b() {
        return this.f33619a;
    }

    /* renamed from: c */
    public final MotionEvent m36952c() {
        vp8 vp8Var = this.f33620b;
        if (vp8Var != null) {
            return vp8Var.m53177b();
        }
        return null;
    }

    /* renamed from: d */
    public final int m36953d() {
        return this.f33623e;
    }

    /* renamed from: e */
    public final void m36954e(int i) {
        this.f33623e = i;
    }
}
