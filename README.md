# Actividad1MicroClase
## Diagrama de clases:

[Bridge.drawio](https://github.com/user-attachments/files/22146887/Bridge.drawio)
<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36" version="28.1.2">
  <diagram name="Página-1" id="aY2e4Hb4I7O1EXX4FsQU">
    <mxGraphModel dx="2316" dy="803" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-4" value="" style="endArrow=open;html=1;endSize=12;startArrow=diamondThin;startSize=14;startFill=1;edgeStyle=orthogonalEdgeStyle;align=left;verticalAlign=bottom;rounded=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;exitX=0;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="1" source="NLHbeGcc4qUr0cDpyiFE-5" target="NLHbeGcc4qUr0cDpyiFE-32">
          <mxGeometry x="-1" y="3" relative="1" as="geometry">
            <mxPoint x="-350" y="188" as="sourcePoint" />
            <mxPoint x="-420" y="260" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-5" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;b&gt;Mascota&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ nombre : String&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ peso : double&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ comida : Comida&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ calcularAlimento(): double&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="-346" y="157" width="160" height="110" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-6" value="Pienso" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-120" y="216" width="100" height="34" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-8" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-6">
          <mxGeometry y="26" width="100" height="8" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-10" value="Natural" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-130" y="80" width="110" height="34" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-12" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-10">
          <mxGeometry y="26" width="110" height="8" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-14" value="Humeda" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-120" y="140" width="100" height="34" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-16" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-14">
          <mxGeometry y="26" width="100" height="8" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-25" value="" style="endArrow=open;endFill=1;endSize=12;html=1;rounded=0;entryX=1;entryY=0.339;entryDx=0;entryDy=0;exitX=0;exitY=0.5;exitDx=0;exitDy=0;entryPerimeter=0;" edge="1" parent="1" source="NLHbeGcc4qUr0cDpyiFE-10" target="NLHbeGcc4qUr0cDpyiFE-5">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="-290" y="10" as="sourcePoint" />
            <mxPoint x="-130" y="10" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-26" value="" style="endArrow=open;endFill=1;endSize=12;html=1;rounded=0;entryX=0.99;entryY=0.401;entryDx=0;entryDy=0;exitX=0;exitY=0.75;exitDx=0;exitDy=0;entryPerimeter=0;" edge="1" parent="1" source="NLHbeGcc4qUr0cDpyiFE-14" target="NLHbeGcc4qUr0cDpyiFE-5">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="-84" y="100" as="sourcePoint" />
            <mxPoint x="-150" y="220" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-27" value="" style="endArrow=open;endFill=1;endSize=12;html=1;rounded=0;entryX=1.01;entryY=0.584;entryDx=0;entryDy=0;exitX=0;exitY=0.5;exitDx=0;exitDy=0;entryPerimeter=0;" edge="1" parent="1" source="NLHbeGcc4qUr0cDpyiFE-6" target="NLHbeGcc4qUr0cDpyiFE-5">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="-64" y="200" as="sourcePoint" />
            <mxPoint x="-130" y="320" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-29" value="Comida" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-600" y="155" width="160" height="80" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-31" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-29">
          <mxGeometry y="26" width="160" height="8" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-32" value="+ calcularCantidad(peso : double) double" style="text;strokeColor=none;fillColor=none;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;whiteSpace=wrap;html=1;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-29">
          <mxGeometry y="34" width="160" height="46" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-34" value="Natural" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-760" y="178" width="80" height="34" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-36" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-34">
          <mxGeometry y="26" width="80" height="8" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-38" value="Humeda" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-790" y="264" width="110" height="34" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-40" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-38">
          <mxGeometry y="26" width="110" height="8" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-46" value="Pienso" style="swimlane;fontStyle=1;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeParentMax=0;resizeLast=0;collapsible=1;marginBottom=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-770" y="114" width="90" height="34" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-47" value="" style="line;strokeWidth=1;fillColor=none;align=left;verticalAlign=middle;spacingTop=-1;spacingLeft=3;spacingRight=3;rotatable=0;labelPosition=right;points=[];portConstraint=eastwest;strokeColor=inherit;" vertex="1" parent="NLHbeGcc4qUr0cDpyiFE-46">
          <mxGeometry y="26" width="90" height="8" as="geometry" />
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-48" value="" style="endArrow=open;endFill=1;endSize=12;html=1;rounded=0;exitX=1;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="1" source="NLHbeGcc4qUr0cDpyiFE-46">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="-760" y="178" as="sourcePoint" />
            <mxPoint x="-600" y="178" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-49" value="" style="endArrow=open;endFill=1;endSize=12;html=1;rounded=0;exitX=1;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="1">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="-680" y="197" as="sourcePoint" />
            <mxPoint x="-600" y="204" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-50" value="" style="endArrow=open;endFill=1;endSize=12;html=1;rounded=0;exitX=1;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="1">
          <mxGeometry width="160" relative="1" as="geometry">
            <mxPoint x="-680" y="284" as="sourcePoint" />
            <mxPoint x="-600" y="214" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="NLHbeGcc4qUr0cDpyiFE-52" value="Contiene" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="1">
          <mxGeometry x="-413" y="174" width="70" height="30" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
