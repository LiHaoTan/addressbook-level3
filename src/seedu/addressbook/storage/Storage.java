package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public abstract class Storage {

    public class TypeInfo {
        private String type;
        private String details;

        public TypeInfo(String type, String details) {
            this.type = type;
            this.details = details;
        }
        /**
         * Returns the storage type
         */
        public String getType() {
            return type;
        }
        /**
         * Returns the details of the type, such as a file or registry path
         */
        public String getDetails() {
            return details;
        }
    }

    /**
     * Loads data from the storage based on the storage type.
     *
     * @throws StorageOperationException if some error has occurred while trying to load data.
     */
    public abstract AddressBook load() throws StorageOperationException;

    /**
     * Saves all data to the storage based on the storage type.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to the storage.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    //public abstract String getPath();
    public abstract TypeInfo getTypeInfo();

}
