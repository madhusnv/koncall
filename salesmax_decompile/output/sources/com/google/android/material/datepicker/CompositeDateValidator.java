package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.fgd;

/* loaded from: classes3.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: a */
    public final InterfaceC11010d f12394a;

    /* renamed from: b */
    public final List f12395b;

    /* renamed from: c */
    public static final InterfaceC11010d f12392c = new C11007a();

    /* renamed from: d */
    public static final InterfaceC11010d f12393d = new C11008b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C11009c();

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    public class C11007a implements InterfaceC11010d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC11010d
        /* renamed from: a */
        public boolean mo14468a(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.L0(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC11010d
        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    public class C11008b implements InterfaceC11010d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC11010d
        /* renamed from: a */
        public boolean mo14468a(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.L0(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC11010d
        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    public class C11009c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            InterfaceC11010d interfaceC11010d = (i != 2 && i == 1) ? CompositeDateValidator.f12392c : CompositeDateValidator.f12393d;
            return new CompositeDateValidator((List) fgd.m26663g(arrayList), interfaceC11010d, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    public interface InterfaceC11010d {
        /* renamed from: a */
        boolean mo14468a(List list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, InterfaceC11010d interfaceC11010d, C11007a c11007a) {
        this(list, interfaceC11010d);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean L0(long j) {
        return this.f12394a.mo14468a(this.f12395b, j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f12395b.equals(compositeDateValidator.f12395b) && this.f12394a.getId() == compositeDateValidator.f12394a.getId();
    }

    public int hashCode() {
        return this.f12395b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f12395b);
        parcel.writeInt(this.f12394a.getId());
    }

    public CompositeDateValidator(List list, InterfaceC11010d interfaceC11010d) {
        this.f12395b = list;
        this.f12394a = interfaceC11010d;
    }
}
