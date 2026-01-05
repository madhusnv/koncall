package ai.salesmax.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ContactsLoadMore implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContactsLoadMore> CREATOR = new Creator();
    private List<UserContactDetail> contacts;
    private int count;

    public static final class Creator implements Parcelable.Creator<ContactsLoadMore> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactsLoadMore createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UserContactDetail.CREATOR.createFromParcel(parcel));
            }
            return new ContactsLoadMore(arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactsLoadMore[] newArray(int i) {
            return new ContactsLoadMore[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContactsLoadMore() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContactsLoadMore copy$default(ContactsLoadMore contactsLoadMore, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = contactsLoadMore.contacts;
        }
        if ((i2 & 2) != 0) {
            i = contactsLoadMore.count;
        }
        return contactsLoadMore.copy(list, i);
    }

    public final List<UserContactDetail> component1() {
        return this.contacts;
    }

    public final int component2() {
        return this.count;
    }

    public final ContactsLoadMore copy(List<UserContactDetail> list, int i) {
        sq8.m48649h(list, "contacts");
        return new ContactsLoadMore(list, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsLoadMore)) {
            return false;
        }
        ContactsLoadMore contactsLoadMore = (ContactsLoadMore) obj;
        return sq8.m48644c(this.contacts, contactsLoadMore.contacts) && this.count == contactsLoadMore.count;
    }

    public final List<UserContactDetail> getContacts() {
        return this.contacts;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return (this.contacts.hashCode() * 31) + Integer.hashCode(this.count);
    }

    public final void setContacts(List<UserContactDetail> list) {
        sq8.m48649h(list, "<set-?>");
        this.contacts = list;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public String toString() {
        return "ContactsLoadMore(contacts=" + this.contacts + ", count=" + this.count + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        List<UserContactDetail> list = this.contacts;
        parcel.writeInt(list.size());
        Iterator<UserContactDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
    }

    public ContactsLoadMore(List<UserContactDetail> list, int i) {
        sq8.m48649h(list, "contacts");
        this.contacts = list;
        this.count = i;
    }

    public /* synthetic */ ContactsLoadMore(List list, int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? 0 : i);
    }
}
