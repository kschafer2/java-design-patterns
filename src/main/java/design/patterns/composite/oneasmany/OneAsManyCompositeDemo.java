package design.patterns.composite.oneasmany;

import design.patterns.composite.oneasmany.model.NeuralLayer;
import design.patterns.composite.oneasmany.model.Neuron;

//One As Many

// A Neuron masquerading as a group of objects allows a Neuron
// and a NeuralLayer to share the same connectTo implementation

public class OneAsManyCompositeDemo {
    public static void main(String[] args) {
        Neuron neuron = new Neuron();
        Neuron neuron2 = new Neuron();
        NeuralLayer layer = new NeuralLayer();
        NeuralLayer layer2 = new NeuralLayer();

        neuron.connectTo(neuron2);
        neuron.connectTo(layer);
        layer.connectTo(neuron);
        layer.connectTo(layer2);
    }
}
