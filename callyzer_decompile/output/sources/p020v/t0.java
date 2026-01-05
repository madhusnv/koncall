package p020v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import ex.InterfaceC2137a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import og.od;
import p0.AbstractC5787a;
import p021w.C7843i;
import qw.C6363m;
import qw.C6366p;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.C6668r;
import v0.C7622f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: e */
    public static final Range f36692e = new Range(120, 120);

    /* renamed from: a */
    public final C7843i f36693a;

    /* renamed from: b */
    public final C6366p f36694b;

    /* renamed from: c */
    public final C6366p f36695c;

    /* renamed from: d */
    public final C6366p f36696d;

    public t0(C7843i characteristics) {
        AbstractC4154l.m8923f(characteristics, "characteristics");
        this.f36693a = characteristics;
        final int i10 = 0;
        this.f36694b = nd.m10782c(new InterfaceC2137a(this) { // from class: v.s0

            /* renamed from: b */
            public final /* synthetic */ t0 f36691b;

            {
                this.f36691b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int[] iArr = (int[]) this.f36691b.f36693a.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z6 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    if (iArr[i11] == 9) {
                                        z6 = true;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z6);
                    case 1:
                        List list = (List) this.f36691b.f36696d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iM11337a = AbstractC5787a.m11337a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iM11337a2 = AbstractC5787a.m11337a((Size) next2);
                                if (iM11337a < iM11337a2) {
                                    next = next2;
                                    iM11337a = iM11337a2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((C7622f) this.f36691b.f36693a.m14825c().f35537b).f36778a).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? AbstractC6662l.m12729s(highSpeedVideoSizes) : C6668r.f31943a;
                }
            }
        });
        final int i11 = 1;
        this.f36695c = nd.m10782c(new InterfaceC2137a(this) { // from class: v.s0

            /* renamed from: b */
            public final /* synthetic */ t0 f36691b;

            {
                this.f36691b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        int[] iArr = (int[]) this.f36691b.f36693a.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z6 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i112 = 0;
                            while (true) {
                                if (i112 < length) {
                                    if (iArr[i112] == 9) {
                                        z6 = true;
                                    } else {
                                        i112++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z6);
                    case 1:
                        List list = (List) this.f36691b.f36696d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iM11337a = AbstractC5787a.m11337a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iM11337a2 = AbstractC5787a.m11337a((Size) next2);
                                if (iM11337a < iM11337a2) {
                                    next = next2;
                                    iM11337a = iM11337a2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((C7622f) this.f36691b.f36693a.m14825c().f35537b).f36778a).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? AbstractC6662l.m12729s(highSpeedVideoSizes) : C6668r.f31943a;
                }
            }
        });
        final int i12 = 2;
        this.f36696d = nd.m10782c(new InterfaceC2137a(this) { // from class: v.s0

            /* renamed from: b */
            public final /* synthetic */ t0 f36691b;

            {
                this.f36691b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        int[] iArr = (int[]) this.f36691b.f36693a.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z6 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i112 = 0;
                            while (true) {
                                if (i112 < length) {
                                    if (iArr[i112] == 9) {
                                        z6 = true;
                                    } else {
                                        i112++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z6);
                    case 1:
                        List list = (List) this.f36691b.f36696d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iM11337a = AbstractC5787a.m11337a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iM11337a2 = AbstractC5787a.m11337a((Size) next2);
                                if (iM11337a < iM11337a2) {
                                    next = next2;
                                    iM11337a = iM11337a2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((C7622f) this.f36691b.f36693a.m14825c().f35537b).f36778a).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? AbstractC6662l.m12729s(highSpeedVideoSizes) : C6668r.f31943a;
                }
            }
        });
    }

    /* renamed from: a */
    public static List m14427a(List list) {
        if (list.isEmpty()) {
            return C6668r.f31943a;
        }
        ArrayList arrayListD0 = AbstractC6663m.d0((Collection) AbstractC6663m.m12742F(list));
        Iterator it = AbstractC6663m.m12738B(list).iterator();
        while (it.hasNext()) {
            arrayListD0.retainAll((List) it.next());
        }
        return arrayListD0;
    }

    /* renamed from: b */
    public final Range[] m14428b(List surfaceSizes) {
        AbstractC4154l.m8923f(surfaceSizes, "surfaceSizes");
        int size = surfaceSizes.size();
        if (1 <= size && size < 3 && AbstractC6663m.m12737A(surfaceSizes).size() == 1) {
            List listM14429c = m14429c((Size) surfaceSizes.get(0));
            if (listM14429c.isEmpty()) {
                listM14429c = null;
            }
            if (listM14429c != null) {
                if (surfaceSizes.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listM14429c) {
                        Range range = (Range) obj;
                        if (AbstractC4154l.m8918a(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listM14429c = arrayList;
                }
                return (Range[]) listM14429c.toArray(new Range[0]);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final List m14429c(Size size) {
        Object objM10796a;
        try {
            objM10796a = ((StreamConfigurationMap) ((C7622f) this.f36693a.m14825c().f35537b).f36778a).getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        if (objM10796a instanceof C6363m) {
            objM10796a = null;
        }
        Range[] rangeArr = (Range[]) objM10796a;
        return rangeArr != null ? AbstractC6663m.c0(AbstractC6662l.m12729s(rangeArr)) : C6668r.f31943a;
    }
}
