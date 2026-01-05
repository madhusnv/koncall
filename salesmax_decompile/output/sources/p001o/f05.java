package p001o;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public class f05 extends BaseAdapter {

    /* renamed from: d */
    public static final int f22489d;

    /* renamed from: a */
    public final Calendar f22490a;

    /* renamed from: b */
    public final int f22491b;

    /* renamed from: c */
    public final int f22492c;

    static {
        f22489d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public f05() {
        Calendar calendarM29327m = gqi.m29327m();
        this.f22490a = calendarM29327m;
        this.f22491b = calendarM29327m.getMaximum(7);
        this.f22492c = calendarM29327m.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.f22491b) {
            return null;
        }
        return Integer.valueOf(m25917b(i));
    }

    /* renamed from: b */
    public final int m25917b(int i) {
        int i2 = i + this.f22492c;
        int i3 = this.f22491b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22491b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(n9e.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f22490a.set(7, m25917b(i));
        textView.setText(this.f22490a.getDisplayName(7, f22489d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(v9e.mtrl_picker_day_of_week_column_header), this.f22490a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public f05(int i) {
        Calendar calendarM29327m = gqi.m29327m();
        this.f22490a = calendarM29327m;
        this.f22491b = calendarM29327m.getMaximum(7);
        this.f22492c = i;
    }
}
