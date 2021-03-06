package org.hotelbyte.wallet.bean;

import org.hotelbyte.wallet.interfaces.StoredWallet;

import java.io.Serializable;


public class WatchWallet implements StoredWallet, Serializable {

    private static final long serialVersionUID = -146500951598835658L;
    private String pubKey;
    private long dateAdded;

    public WatchWallet(String pubKey) {
        this.pubKey = pubKey.toLowerCase();
        this.dateAdded = System.currentTimeMillis();
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public long getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(long dateAdded) {
        this.dateAdded = dateAdded;
    }
}
