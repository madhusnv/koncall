package p001o;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.weg;

/* loaded from: classes2.dex */
public class kne {

    /* renamed from: a */
    public final ExtraCroppingQuirk f32481a;

    public kne() {
        this((ExtraCroppingQuirk) zq5.m59712b(ExtraCroppingQuirk.class));
    }

    /* renamed from: a */
    public List m35965a(weg.EnumC17833b enumC17833b, List list) {
        Size sizeM4554c;
        ExtraCroppingQuirk extraCroppingQuirk = this.f32481a;
        if (extraCroppingQuirk == null || (sizeM4554c = extraCroppingQuirk.m4554c(enumC17833b)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(sizeM4554c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!size.equals(sizeM4554c)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public kne(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f32481a = extraCroppingQuirk;
    }
}
