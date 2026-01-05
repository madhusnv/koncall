package m5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.i */
/* loaded from: classes.dex */
public final class C4655i {

    /* renamed from: a */
    public final float f22964a;

    /* renamed from: b */
    public final float f22965b;

    /* renamed from: c */
    public final float f22966c;

    /* renamed from: d */
    public final float f22967d;

    /* renamed from: e */
    public final int f22968e;

    public C4655i(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f22964a = Float.NaN;
        this.f22965b = Float.NaN;
        this.f22966c = Float.NaN;
        this.f22967d = Float.NaN;
        this.f22968e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4664r.f23062i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22968e);
                this.f22968e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C4661o().m9544b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f22967d = typedArrayObtainStyledAttributes.getDimension(index, this.f22967d);
            } else if (index == 2) {
                this.f22965b = typedArrayObtainStyledAttributes.getDimension(index, this.f22965b);
            } else if (index == 3) {
                this.f22966c = typedArrayObtainStyledAttributes.getDimension(index, this.f22966c);
            } else if (index == 4) {
                this.f22964a = typedArrayObtainStyledAttributes.getDimension(index, this.f22964a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
