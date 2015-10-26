package zsdn.topics;

import jmf.data.MessageType;
import jmf.data.builder.MessageTypeBuilder;

/**
 * Autogenerated Code. Changes here will be automatically overwritten.
 *
 * @author Andre Kutzleb
 */
public class TopologyModuleTopics {

private static final byte  TOPIC_VAL__FROM = (byte)0x02L;
private static final short TOPIC_VAL__FROM__TOPOLOGY_MODULE = (short)0x0006L;
private static final byte  TOPIC_VAL__FROM__TOPOLOGY_MODULE__TOPOLOGY_CHANGED_EVENT = (byte)0x00L;
private static final byte  TOPIC_VAL__REQUEST = (byte)0x03L;
private static final short TOPIC_VAL__REQUEST__TOPOLOGY_MODULE = (short)0x0006L;
private static final byte  TOPIC_VAL__REQUEST__TOPOLOGY_MODULE__GET_TOPOLOGY = (byte)0x00L;
private static final byte  TOPIC_VAL__REPLY = (byte)0x04L;
private static final short TOPIC_VAL__REPLY__TOPOLOGY_MODULE = (short)0x0006L;
private static final byte  TOPIC_VAL__REPLY__TOPOLOGY_MODULE__GET_TOPOLOGY = (byte)0x00L;

public static class FROM {
private final MessageTypeBuilder id;
public class TOPOLOGY_MODULE {
public class TOPOLOGY_CHANGED_EVENT {
private TOPOLOGY_CHANGED_EVENT() {id.appendMatch8((byte) TOPIC_VAL__FROM__TOPOLOGY_MODULE__TOPOLOGY_CHANGED_EVENT); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private TOPOLOGY_MODULE() {id.appendMatch16((short) TOPIC_VAL__FROM__TOPOLOGY_MODULE); }
public TOPOLOGY_CHANGED_EVENT topology_changed_event() {return new TOPOLOGY_CHANGED_EVENT();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public FROM() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__FROM); }
public FROM(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__FROM); }
public TOPOLOGY_MODULE topology_module() {return new TOPOLOGY_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public static class REQUEST {
private final MessageTypeBuilder id;
public class TOPOLOGY_MODULE {
public class GET_TOPOLOGY {
private GET_TOPOLOGY() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__TOPOLOGY_MODULE__GET_TOPOLOGY); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private TOPOLOGY_MODULE() {id.appendMatch16((short) TOPIC_VAL__REQUEST__TOPOLOGY_MODULE); }
public GET_TOPOLOGY get_topology() {return new GET_TOPOLOGY();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public REQUEST() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__REQUEST); }
public REQUEST(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__REQUEST); }
public TOPOLOGY_MODULE topology_module() {return new TOPOLOGY_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public static class REPLY {
private final MessageTypeBuilder id;
public class TOPOLOGY_MODULE {
public class GET_TOPOLOGY {
private GET_TOPOLOGY() {id.appendMatch8((byte) TOPIC_VAL__REPLY__TOPOLOGY_MODULE__GET_TOPOLOGY); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private TOPOLOGY_MODULE() {id.appendMatch16((short) TOPIC_VAL__REPLY__TOPOLOGY_MODULE); }
public GET_TOPOLOGY get_topology() {return new GET_TOPOLOGY();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public REPLY() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__REPLY); }
public REPLY(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__REPLY); }
public TOPOLOGY_MODULE topology_module() {return new TOPOLOGY_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

};
