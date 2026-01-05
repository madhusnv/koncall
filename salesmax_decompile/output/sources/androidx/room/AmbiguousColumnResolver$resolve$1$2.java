package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p001o.kf9;
import p001o.kl8;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver$resolve$1$2 extends kf9 implements xk7 {
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$2(List<? extends List<AmbiguousColumnResolver.Match>> list, int i) {
        super(1);
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Integer>) obj);
        return y3i.f54824a;
    }

    public final void invoke(List<Integer> list) {
        sq8.m48649h(list, "indices");
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int iIntValue4 = ((Number) it2.next()).intValue();
            if (iIntValue3 < iIntValue4) {
                iIntValue3 = iIntValue4;
            }
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new kl8(iIntValue, iIntValue3), list));
    }
}
