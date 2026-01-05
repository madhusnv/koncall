package p001o;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b72 implements m92 {

    /* renamed from: a */
    public final Map f15605a;

    /* renamed from: b */
    public final q32 f15606b;

    /* renamed from: o.b72$a */
    public class C12288a implements q32 {
        @Override // p001o.q32
        /* renamed from: a */
        public CamcorderProfile mo18210a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // p001o.q32
        /* renamed from: b */
        public boolean mo18211b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public b72(Context context, Object obj, Set set) {
        this(context, new C12288a(), obj, set);
    }

    @Override // p001o.m92
    /* renamed from: a */
    public Pair mo18207a(int i, String str, List list, Map map, boolean z, boolean z2) {
        fgd.m26658b(!map.isEmpty(), "No new use cases to be bound.");
        ueg uegVar = (ueg) this.f15605a.get(str);
        if (uegVar != null) {
            return uegVar.m51463A(i, list, map, z, z2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // p001o.m92
    /* renamed from: b */
    public weg mo18208b(int i, String str, int i2, Size size) {
        ueg uegVar = (ueg) this.f15605a.get(str);
        if (uegVar != null) {
            return uegVar.m51473M(i, i2, size);
        }
        return null;
    }

    /* renamed from: c */
    public final void m18209c(Context context, z92 z92Var, Set set) {
        fgd.m26663g(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f15605a.put(str, new ueg(context, str, z92Var, this.f15606b));
        }
    }

    public b72(Context context, q32 q32Var, Object obj, Set set) {
        this.f15605a = new HashMap();
        fgd.m26663g(q32Var);
        this.f15606b = q32Var;
        m18209c(context, obj instanceof z92 ? (z92) obj : z92.m58950a(context), set);
    }
}
