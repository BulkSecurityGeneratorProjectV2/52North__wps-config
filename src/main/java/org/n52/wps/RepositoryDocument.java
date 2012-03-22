/*
 * An XML document type.
 * Localname: Repository
 * Namespace: http://n52.org/wps
 * Java type: org.n52.wps.RepositoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.n52.wps;


/**
 * A document containing one Repository(@http://n52.org/wps) element.
 *
 * This is a complex type.
 */
public interface RepositoryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepositoryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC48AB9F2ECCE92D00870263D17307532").resolveHandle("repositorya917doctype");
    
    /**
     * Gets the "Repository" element
     */
    org.n52.wps.RepositoryDocument.Repository getRepository();
    
    /**
     * Sets the "Repository" element
     */
    void setRepository(org.n52.wps.RepositoryDocument.Repository repository);
    
    /**
     * Appends and returns a new empty "Repository" element
     */
    org.n52.wps.RepositoryDocument.Repository addNewRepository();
    
    /**
     * An XML Repository(@http://n52.org/wps).
     *
     * This is a complex type.
     */
    public interface Repository extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Repository.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC48AB9F2ECCE92D00870263D17307532").resolveHandle("repositoryf31delemtype");
        
        /**
         * Gets array of all "Property" elements
         */
        org.n52.wps.PropertyDocument.Property[] getPropertyArray();
        
        /**
         * Gets ith "Property" element
         */
        org.n52.wps.PropertyDocument.Property getPropertyArray(int i);
        
        /**
         * Returns number of "Property" element
         */
        int sizeOfPropertyArray();
        
        /**
         * Sets array of all "Property" element
         */
        void setPropertyArray(org.n52.wps.PropertyDocument.Property[] propertyArray);
        
        /**
         * Sets ith "Property" element
         */
        void setPropertyArray(int i, org.n52.wps.PropertyDocument.Property property);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Property" element
         */
        org.n52.wps.PropertyDocument.Property insertNewProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Property" element
         */
        org.n52.wps.PropertyDocument.Property addNewProperty();
        
        /**
         * Removes the ith "Property" element
         */
        void removeProperty(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.n52.wps.RepositoryDocument.Repository.Name xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.n52.wps.RepositoryDocument.Repository.Name name);
        
        /**
         * Gets the "className" attribute
         */
        java.lang.String getClassName();
        
        /**
         * Gets (as xml) the "className" attribute
         */
        org.n52.wps.RepositoryDocument.Repository.ClassName xgetClassName();
        
        /**
         * Sets the "className" attribute
         */
        void setClassName(java.lang.String className);
        
        /**
         * Sets (as xml) the "className" attribute
         */
        void xsetClassName(org.n52.wps.RepositoryDocument.Repository.ClassName className);
        
        /**
         * Gets the "active" attribute
         */
        boolean getActive();
        
        /**
         * Gets (as xml) the "active" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetActive();
        
        /**
         * Sets the "active" attribute
         */
        void setActive(boolean active);
        
        /**
         * Sets (as xml) the "active" attribute
         */
        void xsetActive(org.apache.xmlbeans.XmlBoolean active);
        
        /**
         * An XML name(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.RepositoryDocument$Repository$Name.
         */
        public interface Name extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC48AB9F2ECCE92D00870263D17307532").resolveHandle("namef852attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.RepositoryDocument.Repository.Name newValue(java.lang.Object obj) {
                  return (org.n52.wps.RepositoryDocument.Repository.Name) type.newValue( obj ); }
                
                public static org.n52.wps.RepositoryDocument.Repository.Name newInstance() {
                  return (org.n52.wps.RepositoryDocument.Repository.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.RepositoryDocument.Repository.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.RepositoryDocument.Repository.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML className(@).
         *
         * This is an atomic type that is a restriction of org.n52.wps.RepositoryDocument$Repository$ClassName.
         */
        public interface ClassName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClassName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC48AB9F2ECCE92D00870263D17307532").resolveHandle("classname4572attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.n52.wps.RepositoryDocument.Repository.ClassName newValue(java.lang.Object obj) {
                  return (org.n52.wps.RepositoryDocument.Repository.ClassName) type.newValue( obj ); }
                
                public static org.n52.wps.RepositoryDocument.Repository.ClassName newInstance() {
                  return (org.n52.wps.RepositoryDocument.Repository.ClassName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.n52.wps.RepositoryDocument.Repository.ClassName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.n52.wps.RepositoryDocument.Repository.ClassName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.n52.wps.RepositoryDocument.Repository newInstance() {
              return (org.n52.wps.RepositoryDocument.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.n52.wps.RepositoryDocument.Repository newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.n52.wps.RepositoryDocument.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.n52.wps.RepositoryDocument newInstance() {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.n52.wps.RepositoryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.n52.wps.RepositoryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.n52.wps.RepositoryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.n52.wps.RepositoryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.n52.wps.RepositoryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.n52.wps.RepositoryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.n52.wps.RepositoryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.n52.wps.RepositoryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.RepositoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.n52.wps.RepositoryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.n52.wps.RepositoryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
