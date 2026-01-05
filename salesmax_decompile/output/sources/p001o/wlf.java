package p001o;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public abstract class wlf {

    /* renamed from: o.wlf$a */
    public static final class C17925a implements jcd {

        /* renamed from: a */
        public final /* synthetic */ float[] f52315a;

        /* renamed from: b */
        public final /* synthetic */ Matrix f52316b;

        public C17925a(float[] fArr, Matrix matrix) {
            this.f52315a = fArr;
            this.f52316b = matrix;
        }

        @Override // p001o.jcd
        /* renamed from: a */
        public final long mo33533a(float f, float f2) {
            float[] fArr = this.f52315a;
            fArr[0] = f;
            fArr[1] = f2;
            this.f52316b.mapPoints(fArr);
            float[] fArr2 = this.f52315a;
            return f37.m26029b(fArr2[0], fArr2[1]);
        }
    }

    /* renamed from: a */
    public static final void m54687a(Path path, List list) {
        path.rewind();
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            yc4 yc4Var = (yc4) list.get(i);
            if (z) {
                path.moveTo(yc4Var.m57493b(), yc4Var.m57494c());
                z = false;
            }
            path.cubicTo(yc4Var.m57497f(), yc4Var.m57498g(), yc4Var.m57499h(), yc4Var.m57500i(), yc4Var.m57495d(), yc4Var.m57496e());
        }
        path.close();
    }

    /* renamed from: b */
    public static final Path m54688b(dmb dmbVar, float f, Path path) {
        sq8.m48649h(dmbVar, "<this>");
        sq8.m48649h(path, ClientCookie.PATH_ATTR);
        m54687a(path, dmbVar.m23555a(f));
        return path;
    }

    /* renamed from: c */
    public static final zue m54689c(zue zueVar, Matrix matrix) {
        sq8.m48649h(zueVar, "<this>");
        sq8.m48649h(matrix, "matrix");
        return zueVar.m59951h(new C17925a(new float[2], matrix));
    }
}
