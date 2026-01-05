package com.sun.mail.imap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ACL implements Cloneable {
    private String name;
    private Rights rights;

    public ACL(String str) {
        this.name = str;
        this.rights = new Rights();
    }

    public Object clone() {
        ACL acl = (ACL) super.clone();
        acl.rights = (Rights) this.rights.clone();
        return acl;
    }

    public String getName() {
        return this.name;
    }

    public Rights getRights() {
        return this.rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public ACL(String str, Rights rights) {
        this.name = str;
        this.rights = rights;
    }
}
