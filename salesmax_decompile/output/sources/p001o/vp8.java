package p001o;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class vp8 {

    /* renamed from: a */
    public final Map f50696a;

    /* renamed from: b */
    public final xcd f50697b;

    /* renamed from: c */
    public boolean f50698c;

    public vp8(Map map, xcd xcdVar) {
        sq8.m48649h(map, "changes");
        sq8.m48649h(xcdVar, "pointerInputEvent");
        this.f50696a = map;
        this.f50697b = xcdVar;
    }

    /* renamed from: a */
    public final Map m53176a() {
        return this.f50696a;
    }

    /* renamed from: b */
    public final MotionEvent m53177b() {
        return this.f50697b.m56021a();
    }

    /* renamed from: c */
    public final boolean m53178c() {
        return this.f50698c;
    }

    /* renamed from: d */
    public final boolean m53179d(long j) {
        Object obj;
        List listM56022b = this.f50697b.m56022b();
        int size = listM56022b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listM56022b.get(i);
            if (ucd.m51366d(((ycd) obj).m57566c(), j)) {
                break;
            }
            i++;
        }
        ycd ycdVar = (ycd) obj;
        if (ycdVar != null) {
            return ycdVar.m57567d();
        }
        return false;
    }
}
