/**
 */
package fr.obeo.dsl.process.provider;

import fr.obeo.dsl.process.util.ProcessAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProviderAdapterFactory extends ProcessAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.Process} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ProcessItemProvider processItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.Process}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessAdapter() {
		if (processItemProvider == null) {
			processItemProvider = new ProcessItemProvider(this);
		}

		return processItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.ComposedTask} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedTaskItemProvider composedTaskItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.ComposedTask}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComposedTaskAdapter() {
		if (composedTaskItemProvider == null) {
			composedTaskItemProvider = new ComposedTaskItemProvider(this);
		}

		return composedTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.ActionTask} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActionTaskItemProvider actionTaskItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.ActionTask}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionTaskAdapter() {
		if (actionTaskItemProvider == null) {
			actionTaskItemProvider = new ActionTaskItemProvider(this);
		}

		return actionTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.AllDone} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AllDoneItemProvider allDoneItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.AllDone}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllDoneAdapter() {
		if (allDoneItemProvider == null) {
			allDoneItemProvider = new AllDoneItemProvider(this);
		}

		return allDoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.AnyDone} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AnyDoneItemProvider anyDoneItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.AnyDone}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnyDoneAdapter() {
		if (anyDoneItemProvider == null) {
			anyDoneItemProvider = new AnyDoneItemProvider(this);
		}

		return anyDoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.OneDone} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OneDoneItemProvider oneDoneItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.OneDone}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOneDoneAdapter() {
		if (oneDoneItemProvider == null) {
			oneDoneItemProvider = new OneDoneItemProvider(this);
		}

		return oneDoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.Not} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.Not}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.And} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.And}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.Or} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.Or}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.ProcessContext} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessContextItemProvider processContextItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.ProcessContext}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessContextAdapter() {
		if (processContextItemProvider == null) {
			processContextItemProvider = new ProcessContextItemProvider(this);
		}

		return processContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.obeo.dsl.process.ContextVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextVariableItemProvider contextVariableItemProvider;

	/**
	 * This creates an adapter for a {@link fr.obeo.dsl.process.ContextVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextVariableAdapter() {
		if (contextVariableItemProvider == null) {
			contextVariableItemProvider = new ContextVariableItemProvider(this);
		}

		return contextVariableItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (processItemProvider != null) processItemProvider.dispose();
		if (composedTaskItemProvider != null) composedTaskItemProvider.dispose();
		if (actionTaskItemProvider != null) actionTaskItemProvider.dispose();
		if (allDoneItemProvider != null) allDoneItemProvider.dispose();
		if (anyDoneItemProvider != null) anyDoneItemProvider.dispose();
		if (oneDoneItemProvider != null) oneDoneItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (processContextItemProvider != null) processContextItemProvider.dispose();
		if (contextVariableItemProvider != null) contextVariableItemProvider.dispose();
	}

}
