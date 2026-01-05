package og;

import android.view.View;
import android.view.ViewParent;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class oe {
    /* renamed from: a */
    public static void m10799a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "startIndex: ", ", endIndex: ", ", size: ");
            sbM4566m.append(i12);
            throw new IndexOutOfBoundsException(sbM4566m.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("startIndex: ", i10, i11, " > endIndex: "));
        }
    }

    /* renamed from: b */
    public static void m10800b(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM4566m = AbstractC1452a.m4566m(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbM4566m.append(i12);
            throw new IndexOutOfBoundsException(sbM4566m.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("fromIndex: ", i10, i11, " > toIndex: "));
        }
    }

    /* renamed from: c */
    public static final ViewParent m10801c(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
