package Overview_of.serializationNdeserialization_in_inheritance;

public interface MainDriver {
	public static final SerializationCumMarshalling SERIALIZATION_CUM_MARSHALLING=new SerializationCumMarshalling();
	public static final DeSerializationCumUnMarshalling DE_SERIALIZATION_CUM_UN_MARSHALLING=new DeSerializationCumUnMarshalling();
	public static void main(String[] args) {
		SERIALIZATION_CUM_MARSHALLING.marshallingCumSerialization();
		DE_SERIALIZATION_CUM_UN_MARSHALLING.unMarshallingCumDeSerialization();
	}	
}
