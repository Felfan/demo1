package beans;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 房庆丰 on 2016/11/19.
 */

public class Person implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public Person() {
    }

    protected Person(Parcel in) {
    }

    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
