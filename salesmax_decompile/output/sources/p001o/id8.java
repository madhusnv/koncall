package p001o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class id8 {

    /* renamed from: a */
    public final List f28482a = new ArrayList();

    /* renamed from: a */
    public synchronized void m31919a(ImageHeaderParser imageHeaderParser) {
        this.f28482a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List m31920b() {
        return this.f28482a;
    }
}
