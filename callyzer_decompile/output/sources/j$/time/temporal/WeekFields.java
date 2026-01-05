package j$.time.temporal;

import j$.time.DayOfWeek;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class WeekFields implements Serializable {

    /* renamed from: g */
    public static final ConcurrentMap f18252g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h */
    public static final EnumC3477g f18253h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a */
    public final DayOfWeek f18254a;

    /* renamed from: b */
    public final int f18255b;

    /* renamed from: c */
    public final transient C3486p f18256c;

    /* renamed from: d */
    public final transient C3486p f18257d;

    /* renamed from: e */
    public final transient C3486p f18258e;

    /* renamed from: f */
    public final transient C3486p f18259f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        m8012a(DayOfWeek.SUNDAY, 1);
        f18253h = AbstractC3478h.f18269d;
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        return m8012a(DayOfWeek.f18011a[((((int) ((firstDayOfWeek - 1) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
    }

    /* renamed from: a */
    public static WeekFields m8012a(DayOfWeek dayOfWeek, int i10) {
        String str = dayOfWeek.toString() + i10;
        ConcurrentMap concurrentMap = f18252g;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i10));
        return (WeekFields) concurrentMap.get(str);
    }

    public WeekFields(DayOfWeek dayOfWeek, int i10) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f18256c = new C3486p("DayOfWeek", this, chronoUnit, chronoUnit2, C3486p.f18288f);
        this.f18257d = new C3486p("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, C3486p.f18289g);
        EnumC3477g enumC3477g = AbstractC3478h.f18269d;
        this.f18258e = new C3486p("WeekOfWeekBasedYear", this, chronoUnit2, enumC3477g, C3486p.f18291i);
        this.f18259f = new C3486p("WeekBasedYear", this, enumC3477g, ChronoUnit.FOREVER, ChronoField.YEAR.f18248b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f18254a = dayOfWeek;
        this.f18255b = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f18254a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i10 = this.f18255b;
        if (i10 < 1 || i10 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return m8012a(this.f18254a, this.f18255b);
        } catch (IllegalArgumentException e2) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e2.getMessage());
        }
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.f18254a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f18254a.ordinal() * 7) + this.f18255b;
    }

    public final String toString() {
        return "WeekFields[" + this.f18254a + "," + this.f18255b + "]";
    }
}
