package p001o;

import android.widget.ListView;

/* loaded from: classes2.dex */
public class rfa extends r31 {

    /* renamed from: Z */
    public final ListView f43497Z;

    public rfa(ListView listView) {
        super(listView);
        this.f43497Z = listView;
    }

    @Override // p001o.r31
    /* renamed from: a */
    public boolean mo46158a(int i) {
        return false;
    }

    @Override // p001o.r31
    /* renamed from: b */
    public boolean mo46159b(int i) {
        ListView listView = this.f43497Z;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p001o.r31
    /* renamed from: j */
    public void mo46165j(int i, int i2) {
        this.f43497Z.scrollListBy(i2);
    }
}
