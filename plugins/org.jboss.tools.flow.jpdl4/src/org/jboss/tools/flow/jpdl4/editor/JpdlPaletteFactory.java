package org.jboss.tools.flow.jpdl4.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.jboss.tools.flow.common.editor.PaletteFactory;
import org.jboss.tools.flow.common.registry.ElementRegistry;
import org.jboss.tools.flow.jpdl4.Activator;

public class JpdlPaletteFactory extends PaletteFactory {
    
//    protected List<PaletteContainer> createCategories(PaletteRoot root) {
//        List<PaletteContainer> categories = new ArrayList<PaletteContainer>();
//        categories.add(createControlGroup(root));
//        categories.add(createEventsDrawer());
//        categories.add(createTasksDrawer());
//        categories.add(createGatewayDrawer());
//        categories.add(createFlowDrawer());
//        return categories;
//    }
	
    protected List<PaletteEntry> createComponentEntries() {
    	ArrayList<PaletteEntry> componentEntries = new ArrayList<PaletteEntry>();
    	componentEntries.addAll(createFlowEntries());
    	componentEntries.addAll(createEventEntries());
    	componentEntries.addAll(createTaskEntries());
    	componentEntries.addAll(createGatewayEntries());
    	return componentEntries;
    }
    
    protected PaletteContainer createEventsDrawer() {
        PaletteDrawer drawer = new PaletteDrawer("Events", null);
        List<PaletteEntry> entries = createEventEntries();
        drawer.addAll(entries);
        return drawer;
    }
    
    protected PaletteContainer createTasksDrawer() {
        PaletteDrawer drawer = new PaletteDrawer("Tasks", null);
        List<PaletteEntry> entries = createTaskEntries();
        drawer.addAll(entries);
        return drawer;
    }
    
    protected PaletteContainer createGatewayDrawer() {
        PaletteDrawer drawer = new PaletteDrawer("Gateways", null);
        List<PaletteEntry> entries = createGatewayEntries();
        drawer.addAll(entries);
        return drawer;
    }
    
    protected PaletteContainer createFlowDrawer() {
        PaletteDrawer drawer = new PaletteDrawer("Flows", null);
        List<PaletteEntry> entries = createFlowEntries();
        drawer.addAll(entries);
        return drawer;
    }
    
    protected List<PaletteEntry> createEventEntries() {
        List<PaletteEntry> entries = new ArrayList<PaletteEntry>();       
        CombinedTemplateCreationEntry combined = new CombinedTemplateCreationEntry(
            "Start Event",
            "Create a new Start Event",
            "org.jboss.tools.flow.jpdl4.startEvent",
            ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.startEvent"),
            ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/start_event_empty.png")),
            ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/start_event_empty.png"))
        );
        entries.add(combined);        
        combined = new CombinedTemplateCreationEntry(
                "Terminate End Event",
                "Create a new terminating end event",
                "org.jboss.tools.flow.jpdl4.terminateEndEvent",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.terminateEndEvent"),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/end_event_terminate.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/end_event_terminate.png"))
            );
        entries.add(combined);                                  
        combined = new CombinedTemplateCreationEntry(
                "Cancel End Event",
                "Create a new cancel end event",
                "org.jboss.tools.flow.jpdl4.cancelEndEvent",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.cancelEndEvent"),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/end_event_cancel.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/end_event_cancel.png"))
            );
        entries.add(combined);                                  
        combined = new CombinedTemplateCreationEntry(
                "Error End Event",
                "Create a new error end event",
                "org.jboss.tools.flow.jpdl4.errorEndEvent",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.errorEndEvent"),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/end_event_error.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/end_event_error.png"))
            );
        entries.add(combined);                                  
        return entries;
    }
    
    protected List<PaletteEntry> createTaskEntries() {
        List<PaletteEntry> entries = new ArrayList<PaletteEntry>();        
        CombinedTemplateCreationEntry combined = new CombinedTemplateCreationEntry(
                "Wait State Task",
                "Create a new Wait State Task",
                "org.jboss.tools.flow.jpdl4.waitTask",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.waitTask"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/task_wait.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/task_wait.png"))
            );
        entries.add(combined);
        combined = new CombinedTemplateCreationEntry(
                "HQL Task",
                "Create a new HQL Task",
                "org.jboss.tools.flow.jpdl4.hqlTask",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.hqlTask"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/task_hql.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/task_hql.png"))
            );
        entries.add(combined);
        combined = new CombinedTemplateCreationEntry(
                "SQL Task",
                "Create a new SQL Task",
                "org.jboss.tools.flow.jpdl4.sqlTask",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.sqlTask"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/task_sql.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/task_sql.png"))
            );
        entries.add(combined);
        combined = new CombinedTemplateCreationEntry(
                "Java Task",
                "Create a new Java Task",
                "org.jboss.tools.flow.jpdl4.javaTask",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.javaTask"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/task_java.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/task_java.png"))
            );
        entries.add(combined);
        return entries;
    }
    
    protected List<PaletteEntry> createGatewayEntries() {
        List<PaletteEntry> entries = new ArrayList<PaletteEntry>();        
        CombinedTemplateCreationEntry combined = new CombinedTemplateCreationEntry(
                "Exclusive Gateway",
                "Create a new Exclusive Gateway",
                "org.jboss.tools.flow.jpdl4.exclusiveGateway",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.exclusiveGateway"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/gateway_exclusive.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/gateway_exclusive.png"))
            );
        entries.add(combined);
        combined = new CombinedTemplateCreationEntry(
                "Fork Parallel Gateway",
                "Create a new Parallel Fork Gateway",
                "org.jboss.tools.flow.jpdl4.parallelForkGateway",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.parallelForkGateway"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/gateway_parallel.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/gateway_parallel.png"))
            );
        entries.add(combined);
        combined = new CombinedTemplateCreationEntry(
                "Join Parallel Gateway",
                "Create a new Parallel Join Gateway",
                "org.jboss.tools.flow.jpdl4.parallelJoinGateway",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.parallelJoinGateway"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/gateway_parallel.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/gateway_parallel.png"))
            );
        entries.add(combined);
        return entries;
    }
    
    protected List<PaletteEntry> createFlowEntries() {
        List<PaletteEntry> entries = new ArrayList<PaletteEntry>();        
        ToolEntry tool = new ConnectionCreationToolEntry(
                "Sequence Flow",
                "Creating a new Sequence Flow",
                ElementRegistry.getCreationFactory("org.jboss.tools.flow.jpdl4.sequenceFlow"),                
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/16/flow_sequence.png")),
                ImageDescriptor.createFromURL(Activator.getDefault().getBundle().getEntry("icons/32/flow_sequence.png"))
            );
        entries.add(tool);
        return entries;
    }
    
}
