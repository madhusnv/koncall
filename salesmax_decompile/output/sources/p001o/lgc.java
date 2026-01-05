package p001o;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class lgc {

    /* renamed from: a */
    public final String f33760a;

    /* renamed from: b */
    public final ExtraSupportedOutputSizeQuirk f33761b = (ExtraSupportedOutputSizeQuirk) zq5.m59712b(ExtraSupportedOutputSizeQuirk.class);

    /* renamed from: c */
    public final gl6 f33762c;

    public lgc(String str) {
        this.f33760a = str;
        this.f33762c = new gl6(str);
    }

    /* renamed from: a */
    public final void m37152a(List list, int i) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f33761b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrM4557c = extraSupportedOutputSizeQuirk.m4557c(i);
        if (sizeArrM4557c.length > 0) {
            list.addAll(Arrays.asList(sizeArrM4557c));
        }
    }

    /* renamed from: b */
    public Size[] m37153b(Size[] sizeArr, int i) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        m37152a(arrayList, i);
        m37154c(arrayList, i);
        if (arrayList.isEmpty()) {
            wja.m54638l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* renamed from: c */
    public final void m37154c(List list, int i) {
        List listM28995a = this.f33762c.m28995a(i);
        if (listM28995a.isEmpty()) {
            return;
        }
        list.removeAll(listM28995a);
    }
}
